/*
 * Tencent is pleased to support the open source community by making BK-CI 蓝鲸持续集成平台 available.
 *
 * Copyright (C) 2019 THL A29 Limited, a Tencent company.  All rights reserved.
 *
 * BK-CI 蓝鲸持续集成平台 is licensed under the MIT license.
 *
 * A copy of the MIT License is included in this file.
 *
 *
 * Terms of the MIT License:
 * ---------------------------------------------------
 * Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated
 * documentation files (the "Software"), to deal in the Software without restriction, including without limitation the
 * rights to use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of the Software, and to
 * permit persons to whom the Software is furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all copies or substantial portions of
 * the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT
 * LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN
 * NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY,
 * WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE
 * SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 */

package com.tencent.devops.metrics.pojo.dto

import com.tencent.devops.common.web.annotation.BkField
import com.tencent.devops.common.web.constant.BkStyleEnum
import io.swagger.annotations.ApiModel
import io.swagger.annotations.ApiModelProperty

@ApiModel("插件失败信息查询传输对象")
class QueryAtomFailInfoDTO(
    @ApiModelProperty("项目ID")
    val projectId: String,
    @ApiModelProperty("流水线ID")
    val pipelineIds: List<String>? = null,
    @ApiModelProperty("流水线标签")
    val pipelineLabelIds: List<Long>? = null,
    @ApiModelProperty("开始时间")
    val startTime: String,
    @ApiModelProperty("结束时间")
    val endTime: String,
    @ApiModelProperty("错误类型", required = false)
    val errorTypes: List<Int>?,
    @ApiModelProperty("错误码", required = false)
    val errorCodes: List<Int>?,
    @ApiModelProperty("插件code", required = false)
    val atomCodes: List<String>?,
    @ApiModelProperty("页码")
    val page: Int = 1,
    @ApiModelProperty("页数")
    @BkField(patternStyle = BkStyleEnum.PAGE_SIZE_STYLE, required = true)
    val pageSize: Int = 10
)
