/**
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with this
 * work for additional information regarding copyright ownership.  The ASF
 * licenses this file to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * <p>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */

package org.apache.hadoop.yarn.server.federation.store.records;

import org.apache.hadoop.classification.InterfaceAudience.Private;
import org.apache.hadoop.classification.InterfaceAudience.Public;
import org.apache.hadoop.classification.InterfaceStability.Unstable;
import org.apache.hadoop.yarn.util.Records;

/**
 * Response to a query with {@link SubClusterInfo} about a sub-cluster.
 */
@Private
@Unstable
public abstract class GetSubClusterInfoResponse {

  @Private
  @Unstable
  public static GetSubClusterInfoResponse newInstance(
      SubClusterInfo subClusterInfo) {
    GetSubClusterInfoResponse registerSubClusterRequest =
        Records.newRecord(GetSubClusterInfoResponse.class);
    registerSubClusterRequest.setSubClusterInfo(subClusterInfo);
    return registerSubClusterRequest;
  }

  /**
   * Get the {@link SubClusterInfo} encapsulating the information about the
   * sub-cluster.
   *
   * @return the information pertaining to the sub-cluster
   */
  @Public
  @Unstable
  public abstract SubClusterInfo getSubClusterInfo();

  /**
   * Set the {@link SubClusterInfo} encapsulating the information about the
   * sub-cluster.
   *
   * @param subClusterInfo the information pertaining to the sub-cluster
   */
  @Private
  @Unstable
  public abstract void setSubClusterInfo(SubClusterInfo subClusterInfo);

}
