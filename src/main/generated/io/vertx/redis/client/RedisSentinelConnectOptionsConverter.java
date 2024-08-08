package io.vertx.redis.client;

import io.vertx.core.json.JsonObject;
import io.vertx.core.json.JsonArray;
import java.time.Instant;
import java.time.format.DateTimeFormatter;
import java.util.Base64;

/**
 * Converter and mapper for {@link io.vertx.redis.client.RedisSentinelConnectOptions}.
 * NOTE: This class has been automatically generated from the {@link io.vertx.redis.client.RedisSentinelConnectOptions} original class using Vert.x codegen.
 */
public class RedisSentinelConnectOptionsConverter {

  private static final Base64.Decoder BASE64_DECODER = Base64.getUrlDecoder();
  private static final Base64.Encoder BASE64_ENCODER = Base64.getUrlEncoder().withoutPadding();

   static void fromJson(Iterable<java.util.Map.Entry<String, Object>> json, RedisSentinelConnectOptions obj) {
    for (java.util.Map.Entry<String, Object> member : json) {
      switch (member.getKey()) {
        case "role":
          if (member.getValue() instanceof String) {
            obj.setRole(io.vertx.redis.client.RedisRole.valueOf((String)member.getValue()));
          }
          break;
        case "masterName":
          if (member.getValue() instanceof String) {
            obj.setMasterName((String)member.getValue());
          }
          break;
      }
    }
  }

   static void toJson(RedisSentinelConnectOptions obj, JsonObject json) {
    toJson(obj, json.getMap());
  }

   static void toJson(RedisSentinelConnectOptions obj, java.util.Map<String, Object> json) {
    if (obj.getRole() != null) {
      json.put("role", obj.getRole().name());
    }
    if (obj.getMasterName() != null) {
      json.put("masterName", obj.getMasterName());
    }
  }
}
