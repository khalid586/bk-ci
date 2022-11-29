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

package com.tencent.devops.process.pojo.pipeline.record

import com.tencent.devops.process.pojo.pipeline.record.time.BuildRecordTimeCost
import com.tencent.devops.process.pojo.pipeline.record.time.BuildRecordTimeStamp
import io.swagger.annotations.ApiModel
import io.swagger.annotations.ApiModelProperty
import java.time.LocalDateTime

@ApiModel("构建详情记录-插件任务")
data class BuildRecordTask(
    @ApiModelProperty("构建ID", required = true)
    val buildId: String,
    @ApiModelProperty("项目ID", required = true)
    val projectId: String,
    @ApiModelProperty("流水线ID", required = true)
    val pipelineId: String,
    @ApiModelProperty("编排版本号", required = true)
    val resourceVersion: Int,
    @ApiModelProperty("步骤ID", required = true)
    val stageId: String,
    @ApiModelProperty("作业容器ID", required = true)
    val containerId: String,
    @ApiModelProperty("任务ID", required = true)
    val taskId: String,
    @ApiModelProperty("任务序号", required = true)
    val taskSeq: Int,
    @ApiModelProperty("执行次数", required = true)
    val executeCount: Int,
    @ApiModelProperty("执行变量", required = true)
    var taskVar: Map<String, Any>,
    @ApiModelProperty("插件类型标识", required = true)
    val classType: String,
    @ApiModelProperty("市场插件标识", required = true)
    val atomCode: String,
    @ApiModelProperty("分裂前原类型标识", required = false)
    var originClassType: String?, // 如果为空则不再矩阵内，一个字段多个用处
    @ApiModelProperty("开始时间", required = false)
    var startTime: LocalDateTime?,
    @ApiModelProperty("结束时间", required = false)
    var endTime: LocalDateTime?,
    @ApiModelProperty("业务时间戳集合", required = true)
    var timestamps: List<BuildRecordTimeStamp>,
    @ApiModelProperty("各项耗时", required = true)
    var timeCost: BuildRecordTimeCost?
)
