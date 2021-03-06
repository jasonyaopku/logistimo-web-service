/*
 * Copyright © 2017 Logistimo.
 *
 * This file is part of Logistimo.
 *
 * Logistimo software is a mobile & web platform for supply chain management and remote temperature monitoring in
 * low-resource settings, made available under the terms of the GNU Affero General Public License (AGPL).
 *
 * This program is free software: you can redistribute it and/or modify it under the terms of the GNU Affero General
 * Public License as published by the Free Software Foundation, either version 3 of the License, or (at your option) any
 * later version.
 *
 * This program is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; without even the implied
 * warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU Affero General Public License
 * for more details.
 *
 * You should have received a copy of the GNU Affero General Public License along with this program.  If not, see
 * <http://www.gnu.org/licenses/>.
 *
 * You can be released from the requirements of the license by purchasing a commercial license. To know more about
 * the commercial license, please contact us at opensource@logistimo.com
 */

package com.logistimo.api.models;

import com.logistimo.models.BaseResponseModel;

import java.io.Serializable;
import java.util.Map;

/**
 * Created by smriti on 15/02/18.
 */
public class AssetDashboardModel extends BaseResponseModel implements Serializable {
  private Map<String, Long> assetDomain;
  private Map<String, Map<String, DashboardChartModel>> asset;
  private String level;
  private String mTy;
  private String mTyNm;
  private String mPTy;
  private String ut;

  public Map<String, Long> getAssetDomain() {
    return assetDomain;
  }
  public void setAssetDomain(Map<String, Long> assetDomain) {
    this.assetDomain = assetDomain;
  }

  public Map<String, Map<String, DashboardChartModel>> getAsset() {
    return asset;
  }
  public void setAsset(Map<String, Map<String, DashboardChartModel>> asset) {
    this.asset = asset;
  }

  public String getLevel() {
    return level;
  }
  public void setlevel(String level) {
    this.level = level;
  }

  public String getMapType() {
    return mTy;
  }

  public void setMapType(String mTy) {
    this.mTy = mTy;
  }

  public String getMapTypeName() {
    return mTyNm;
  }

  public void setMapTypeName(String mTyNm) {
    this.mTyNm = mTyNm;
  }

  public String getmPTy() {
    return mPTy;
  }

  public void setmPTy(String mPTy) {
    this.mPTy = mPTy;
  }

  public String getUpdatedTime() {
    return ut;
  }

  public void setUpdatedTime(String ut) {
    this.ut = ut;
  }
}
