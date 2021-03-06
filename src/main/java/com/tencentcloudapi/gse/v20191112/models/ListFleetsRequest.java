/*
 * Copyright (c) 2017-2018 THL A29 Limited, a Tencent company. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.tencentcloudapi.gse.v20191112.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ListFleetsRequest extends AbstractModel{

    /**
    * 生成包 Id
    */
    @SerializedName("AssetId")
    @Expose
    private String AssetId;

    /**
    * 结果返回最大值，最小值0，最大值1000
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 结果返回偏移，最小值0
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
     * Get 生成包 Id 
     * @return AssetId 生成包 Id
     */
    public String getAssetId() {
        return this.AssetId;
    }

    /**
     * Set 生成包 Id
     * @param AssetId 生成包 Id
     */
    public void setAssetId(String AssetId) {
        this.AssetId = AssetId;
    }

    /**
     * Get 结果返回最大值，最小值0，最大值1000 
     * @return Limit 结果返回最大值，最小值0，最大值1000
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 结果返回最大值，最小值0，最大值1000
     * @param Limit 结果返回最大值，最小值0，最大值1000
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 结果返回偏移，最小值0 
     * @return Offset 结果返回偏移，最小值0
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 结果返回偏移，最小值0
     * @param Offset 结果返回偏移，最小值0
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AssetId", this.AssetId);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);

    }
}

