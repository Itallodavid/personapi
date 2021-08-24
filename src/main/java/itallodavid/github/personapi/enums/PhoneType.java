package itallodavid.github.personapi.enums;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum PhoneType {

    HOME("home"),
    MOBILE("mobile"),
    COMMERCIAL("commercial");

    private final String description;
}