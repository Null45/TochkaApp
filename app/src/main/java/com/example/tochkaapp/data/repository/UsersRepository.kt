package com.example.tochkaapp.data.repository

import androidx.lifecycle.LiveData
import androidx.paging.PagedList
import com.example.tochkaapp.data.model.GithubUser
import com.example.tochkaapp.utils.LoadingState

/**
 * Created by Vladimir Kraev
 */
interface UsersRepository :
    ClosableRepository,
    LoadingProgressRepository {

    fun getAllUsers(): LiveData<PagedList<GithubUser>>

    fun searchUsers(query: String): LiveData<PagedList<GithubUser>>

}