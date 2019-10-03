/*
 * (C) Copyright IBM Corp. 2019.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations under the License.
 */
package com.ibm.cloud.icpd.v1.model;

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * CreateUserSuccessResponseAllOf1User.
 */
public class CreateUserSuccessResponseAllOf1User extends GenericModel {

  private String ID;
  private String password;

  /**
   * Gets the ID.
   *
   * user name.
   *
   * @return the ID
   */
  public String getID() {
    return ID;
  }

  /**
   * Gets the password.
   *
   * Auto generated password for the new user.
   *
   * @return the password
   */
  public String getPassword() {
    return password;
  }
}

