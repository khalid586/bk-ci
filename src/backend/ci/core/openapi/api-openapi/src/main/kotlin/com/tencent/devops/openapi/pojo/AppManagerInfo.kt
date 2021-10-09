package com.tencent.devops.openapi.pojo

import io.swagger.annotations.ApiModel
import io.swagger.annotations.ApiModelProperty

@ApiModel("")
data class AppManagerInfo(
    @ApiModelProperty("app code")
    val appCode: String,
    @ApiModelProperty("")
    val managerUser: String
)
