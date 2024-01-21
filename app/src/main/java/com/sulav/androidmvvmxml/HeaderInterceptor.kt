package com.sulav.androidmvvmxml

import okhttp3.Interceptor
import okhttp3.Response

class HeaderInterceptor: Interceptor {
    override fun intercept(chain: Interceptor.Chain): Response {
        val originalRequest = chain.request()

        val newRequest = originalRequest.newBuilder()
            .addHeader("X-MASTER-KEY", "\$2a\$10\$07uZcxZMHaNJK6NhuPpnh.wBfN8e9g30mGf/5V3w5Z0Ez5SWWP3aq")
            .addHeader("X-ACCESS-KEY", "\$2a\$10\$DtgJv/29Wg3zdbS9y3zHCucMwOinr20ajd0zodgTK3aiLaJ1L7soy")
            .build()

        return chain.proceed(newRequest)
    }
}