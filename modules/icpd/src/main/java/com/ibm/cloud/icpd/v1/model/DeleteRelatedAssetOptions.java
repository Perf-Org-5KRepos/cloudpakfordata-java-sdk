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
 * The deleteRelatedAsset options.
 */
public class DeleteRelatedAssetOptions extends GenericModel {

  private String assetName;
  private String assetType;
  private String relatedAssetName;
  private String relatedAssetType;

  /**
   * Builder.
   */
  public static class Builder {
    private String assetName;
    private String assetType;
    private String relatedAssetName;
    private String relatedAssetType;

    private Builder(DeleteRelatedAssetOptions deleteRelatedAssetOptions) {
      this.assetName = deleteRelatedAssetOptions.assetName;
      this.assetType = deleteRelatedAssetOptions.assetType;
      this.relatedAssetName = deleteRelatedAssetOptions.relatedAssetName;
      this.relatedAssetType = deleteRelatedAssetOptions.relatedAssetType;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a DeleteRelatedAssetOptions.
     *
     * @return the deleteRelatedAssetOptions
     */
    public DeleteRelatedAssetOptions build() {
      return new DeleteRelatedAssetOptions(this);
    }

    /**
     * Set the assetName.
     *
     * @param assetName the assetName
     * @return the DeleteRelatedAssetOptions builder
     */
    public Builder assetName(String assetName) {
      this.assetName = assetName;
      return this;
    }

    /**
     * Set the assetType.
     *
     * @param assetType the assetType
     * @return the DeleteRelatedAssetOptions builder
     */
    public Builder assetType(String assetType) {
      this.assetType = assetType;
      return this;
    }

    /**
     * Set the relatedAssetName.
     *
     * @param relatedAssetName the relatedAssetName
     * @return the DeleteRelatedAssetOptions builder
     */
    public Builder relatedAssetName(String relatedAssetName) {
      this.relatedAssetName = relatedAssetName;
      return this;
    }

    /**
     * Set the relatedAssetType.
     *
     * @param relatedAssetType the relatedAssetType
     * @return the DeleteRelatedAssetOptions builder
     */
    public Builder relatedAssetType(String relatedAssetType) {
      this.relatedAssetType = relatedAssetType;
      return this;
    }
  }

  private DeleteRelatedAssetOptions(Builder builder) {
    assetName = builder.assetName;
    assetType = builder.assetType;
    relatedAssetName = builder.relatedAssetName;
    relatedAssetType = builder.relatedAssetType;
  }

  /**
   * New builder.
   *
   * @return a DeleteRelatedAssetOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the assetName.
   *
   * Functional area instance name. Ex- TermOne.
   *
   * @return the assetName
   */
  public String assetName() {
    return assetName;
  }

  /**
   * Gets the assetType.
   *
   * Functional area name. Ex- term.
   *
   * @return the assetType
   */
  public String assetType() {
    return assetType;
  }

  /**
   * Gets the relatedAssetName.
   *
   * Functional area instance name. Ex- CategoryOne.
   *
   * @return the relatedAssetName
   */
  public String relatedAssetName() {
    return relatedAssetName;
  }

  /**
   * Gets the relatedAssetType.
   *
   * Functional area name from this Asset Family or could be an asset class name unrelated to this Asset Family. Ex-
   * category.
   *
   * @return the relatedAssetType
   */
  public String relatedAssetType() {
    return relatedAssetType;
  }
}

