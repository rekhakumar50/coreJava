package com.example.demo.Enum;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.apache.commons.lang3.StringUtils;

import java.util.Arrays;

@Getter
@AllArgsConstructor
public enum EntityTypeEnum {
    //By default, enum constructor is private. Other modifiers are not allowed

    SOLE_PROPRIETOR("Sole Proprietor", "PP"),
    PARTNERSHIP("Partnership", "PP"),
    LIMITED_LIABILITY_PARTNERSHIP("Limited Liability Partnership", "LLP"),
    PRIVATE_LIMITED_COMPANY("Private Limited Company", "PRLTD"),
    EXEMPT_PRIVATE_COMPANY_LIMITED_BY_SHARES("EXEMPT PRIVATE COMPANY LIMITED BY SHARES", "PRLTD"),
    PUBLIC_COMPANY("Public Company", "PUB"),
    PUBLIC_COMPANY_LIMITED_BY_SHARES("PUBLIC COMPANY LIMITED BY SHARES", "PUB"),
    PUBLIC_COMPANY_LIMITED_BY_GUARANTEE("PUBLIC COMPANY LIMITED BY GUARANTEE", "PUB"),
    UNLIMITED_COMPANY("Unlimited Company", "UNLTD");

    private final String type;
    private final String code;

    public static String getCodeForType(String type) {
        return Arrays.stream(EntityTypeEnum.values())
                .filter(entityType -> StringUtils.equalsIgnoreCase(entityType.type, type))
                .map(EntityTypeEnum::getCode)
                .findFirst()
                .orElseGet(() -> {
                    String result = "";
                    if (StringUtils.containsIgnoreCase(type, "PRIVATE")) {
                        result = "PRLTD";
                    } else if (StringUtils.containsIgnoreCase(type, "PUBLIC")) {
                        result = "PUB";
                    } else if (StringUtils.containsIgnoreCase(type, "UNLIMITED")) {
                        result = "UNLTD";
                    }
                    return result;
                });
    }

}
