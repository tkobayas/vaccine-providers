package com.example.vaccine

data class VaccineProviderInfoRequest(
  var state: String,
  var fruit: String = "",
  var strictRuleAccepted: Boolean = false,
)
