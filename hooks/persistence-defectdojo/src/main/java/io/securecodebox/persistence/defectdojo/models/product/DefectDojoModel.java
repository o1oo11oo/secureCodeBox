package io.securecodebox.persistence.defectdojo.models.product;

import java.util.Map;

abstract public class DefectDojoModel {
  public abstract boolean equalsQueryString(Map<String,Object> queryParams);
}
