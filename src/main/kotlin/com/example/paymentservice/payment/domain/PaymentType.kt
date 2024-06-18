package com.example.paymentservice.payment.domain

enum class PaymentType(description: String) {
    NORMAL("일반 결제");

    companion object {
        fun get(type: String): PaymentType {
            return entries.find {it.name == type} ?: throw IllegalArgumentException("PaymentType: $type " +
                    "은 올바르지 않은 타입입니다.")
        }
    }
}