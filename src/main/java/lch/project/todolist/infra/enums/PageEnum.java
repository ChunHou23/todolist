package lch.project.todolist.infra.enums;

import lombok.Getter;

public enum PageEnum {
    ALL_PAGE("all task page", 1),
    NEW_PAGE("new task page", 2),
    IN_PROGRESS_PAGE("in progress task page", 3),
    COMPLETED_PAGE("completed task page", 4),
    ;

    @Getter
    private final Integer pageCode;
    @Getter
    private final String pageDesc;

    PageEnum(String pageDesc, Integer pageCode) {
        this.pageCode = pageCode;
        this.pageDesc = pageDesc;
    }

}
