package com.laxa.learnmvvm.di

import android.app.Application
import android.content.Context
import androidx.room.Room
import com.laxa.learnmvvm.model.todos.TodosDatabase
import com.laxa.learnmvvm.model.todos.repository.TodosRepository
import com.laxa.learnmvvm.model.todos.repository.TodosRepositoryImpl
import com.laxa.learnmvvm.view.application.MainApplication
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Singleton
    @Provides
    fun provideApplication(@ApplicationContext app: Context): MainApplication {
        return app as MainApplication
    }

    @Singleton
    @Provides
    fun provideTodosDatabase(app: Application): TodosDatabase {
        return Room.databaseBuilder(
            app,
            TodosDatabase::class.java,
            "todos_db"
        ).fallbackToDestructiveMigration().build()
    }

    @Singleton
    @Provides
    fun provideTodosRepository(db: TodosDatabase): TodosRepository {
        return TodosRepositoryImpl(db.todosDao)
    }
}