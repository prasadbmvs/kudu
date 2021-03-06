// Licensed to the Apache Software Foundation (ASF) under one
// or more contributor license agreements.  See the NOTICE file
// distributed with this work for additional information
// regarding copyright ownership.  The ASF licenses this file
// to you under the Apache License, Version 2.0 (the
// "License"); you may not use this file except in compliance
// with the License.  You may obtain a copy of the License at
//
//   http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing,
// software distributed under the License is distributed on an
// "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
// KIND, either express or implied.  See the License for the
// specific language governing permissions and limitations
// under the License.
package org.kududb.client;

import org.kududb.annotations.InterfaceAudience;
import org.kududb.annotations.InterfaceStability;

/**
 * Response to a isAlterTableDone command to use to know if an alter table is currently running on
 * the specified table.
 */
@InterfaceAudience.Public
@InterfaceStability.Evolving
public class IsAlterTableDoneResponse extends KuduRpcResponse {

  private final boolean done;

  IsAlterTableDoneResponse(long elapsedMillis, String tsUUID, boolean done) {
    super(elapsedMillis, tsUUID);
    this.done = done;
  }

  /**
   * Tells if the table is done being altered or not.
   * @return whether the table alter is done
   */
  public boolean isDone() {
    return done;
  }
}
