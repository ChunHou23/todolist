package lch.project.todolist.model.Dto.Out;

import lombok.Data;

@Data
public class JsonResponse {
    private boolean ok;
    private Integer responseCode;
    private String message;
    private Object data;
}
