package com.qatros.core.base

import androidx.annotation.CallSuper
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import io.reactivex.rxjava3.android.schedulers.AndroidSchedulers
import io.reactivex.rxjava3.core.Observable
import io.reactivex.rxjava3.core.Single
import io.reactivex.rxjava3.disposables.CompositeDisposable
import io.reactivex.rxjava3.disposables.Disposable
import io.reactivex.rxjava3.schedulers.Schedulers

/**
 * @author rivki
 * Created 18/01/22 at 22.48
 */
abstract class BaseViewModel: ViewModel() {
    protected val compositeDisposable = CompositeDisposable()
    protected val _isLoading = MutableLiveData<Boolean>()
    protected val _isError = MutableLiveData<String>()

    val isLoading: LiveData<Boolean> get() = _isLoading
    val isError: LiveData<String> get() = _isError

    private fun launch(job: () -> Disposable){
        compositeDisposable.add(job())
    }

    protected fun<T> Observable<T>.onResult(result: (T) -> Unit, error: (Throwable) -> Unit){
        launch {
            this.doOnSubscribe { _isLoading.postValue(true) }
                .doOnTerminate { _isLoading.postValue(false) }
                .doOnNext { _isLoading.postValue(false) }
                .doOnError { _isLoading.postValue(false) }
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .unsubscribeOn(Schedulers.io())
                .subscribe({
                    result(it)
                }, {
                    error(it)
                })
        }
    }

    protected fun<T> Single<T>.onResult(result: (T) -> Unit, error: (Throwable) -> Unit){
        launch {
            this.doOnSubscribe { _isLoading.postValue(true) }
                .doOnTerminate { _isLoading.postValue(false) }
                .doOnSuccess { _isLoading.postValue(false) }
                .doOnError { _isLoading.postValue(false) }
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .unsubscribeOn(Schedulers.io())
                .subscribe({
                    result(it)
                }, {
                    error(it)
                })
        }
    }

    @CallSuper
    override fun onCleared() {
        super.onCleared()
        compositeDisposable.clear()
    }
}