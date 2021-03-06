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

public class RuntimeConfiguration extends AbstractModel{

    /**
    * 游戏会话进程超时
    */
    @SerializedName("GameServerSessionActivationTimeoutSeconds")
    @Expose
    private Long GameServerSessionActivationTimeoutSeconds;

    /**
    * 最大游戏会话数
    */
    @SerializedName("MaxConcurrentGameServerSessionActivations")
    @Expose
    private Long MaxConcurrentGameServerSessionActivations;

    /**
    * 服务进程配置
    */
    @SerializedName("ServerProcesses")
    @Expose
    private ServerProcesse [] ServerProcesses;

    /**
     * Get 游戏会话进程超时 
     * @return GameServerSessionActivationTimeoutSeconds 游戏会话进程超时
     */
    public Long getGameServerSessionActivationTimeoutSeconds() {
        return this.GameServerSessionActivationTimeoutSeconds;
    }

    /**
     * Set 游戏会话进程超时
     * @param GameServerSessionActivationTimeoutSeconds 游戏会话进程超时
     */
    public void setGameServerSessionActivationTimeoutSeconds(Long GameServerSessionActivationTimeoutSeconds) {
        this.GameServerSessionActivationTimeoutSeconds = GameServerSessionActivationTimeoutSeconds;
    }

    /**
     * Get 最大游戏会话数 
     * @return MaxConcurrentGameServerSessionActivations 最大游戏会话数
     */
    public Long getMaxConcurrentGameServerSessionActivations() {
        return this.MaxConcurrentGameServerSessionActivations;
    }

    /**
     * Set 最大游戏会话数
     * @param MaxConcurrentGameServerSessionActivations 最大游戏会话数
     */
    public void setMaxConcurrentGameServerSessionActivations(Long MaxConcurrentGameServerSessionActivations) {
        this.MaxConcurrentGameServerSessionActivations = MaxConcurrentGameServerSessionActivations;
    }

    /**
     * Get 服务进程配置 
     * @return ServerProcesses 服务进程配置
     */
    public ServerProcesse [] getServerProcesses() {
        return this.ServerProcesses;
    }

    /**
     * Set 服务进程配置
     * @param ServerProcesses 服务进程配置
     */
    public void setServerProcesses(ServerProcesse [] ServerProcesses) {
        this.ServerProcesses = ServerProcesses;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "GameServerSessionActivationTimeoutSeconds", this.GameServerSessionActivationTimeoutSeconds);
        this.setParamSimple(map, prefix + "MaxConcurrentGameServerSessionActivations", this.MaxConcurrentGameServerSessionActivations);
        this.setParamArrayObj(map, prefix + "ServerProcesses.", this.ServerProcesses);

    }
}

