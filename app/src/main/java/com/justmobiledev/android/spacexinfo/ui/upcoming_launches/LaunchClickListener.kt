package com.justmobiledev.android.spacexinfo.ui.upcoming_launches


import com.justmobiledev.android.spacexinfo.database.models.DbLaunch

class LaunchClickListener(val block: (DbLaunch) -> Unit) {
    fun onClick(launch: DbLaunch) = block(launch)
}