package com.ghostflying.realmdemo

import io.realm.RealmObject
import io.realm.annotations.PrimaryKey

/**
 * Created by ghostflying on 2017/5/1.
 */
open class Chat(@PrimaryKey open var chatId: Long = -1,
                open var chatTitle : String = ""
) : RealmObject() {
}