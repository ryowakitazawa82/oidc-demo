package com.oidc.oidc_demo

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class OidcDemoApplication

fun main(args: Array<String>) {
	runApplication<OidcDemoApplication>(*args)
}
