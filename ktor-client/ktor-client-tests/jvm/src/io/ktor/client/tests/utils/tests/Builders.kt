/*
* Copyright 2014-2021 JetBrains s.r.o and contributors. Use of this source code is governed by the Apache 2.0 license.
*/

package io.ktor.client.tests.utils.tests

import io.ktor.server.application.*
import io.ktor.server.response.*
import io.ktor.server.routing.*

public fun Application.buildersTest() {
    routing {
        route("builders") {
            get("empty") {
                call.respondText("")
            }
            get("hello") {
                call.respondText("hello")
            }
        }
    }
}
