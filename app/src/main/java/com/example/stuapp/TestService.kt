package com.example.stuapp

import java.security.Provider
import java.security.Provider.Service

/**
 *
 *@Auther MikuCat
 *@Time 2023/8/18
 */
class TestService : Service{
    constructor(
        provider: Provider?,
        type: String?,
        algorithm: String?,
        className: String?,
        aliases: MutableList<String>?,
        attributes: MutableMap<String, String>?
    ) : super(provider, type, algorithm, className, aliases, attributes)
}