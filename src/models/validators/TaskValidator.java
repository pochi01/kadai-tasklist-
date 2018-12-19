package models.validators;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import models.Task;

public class TaskValidator {
    public static List<String>validate(Task t){
        List<String> errors = new ArrayList<String>();

        String content_error = _validateContent(t.getContent());
        if(!content_error.equals("")){
            errors.add(content_error);
        }

        String deadline_error = _validateDeadline(t.getDeadline());
        if(!deadline_error.equals("")){
            errors.add(deadline_error);
        }

        return errors;
    }

    private static String _validateContent(String content){
        if(content == null || content.equals("")){
            return "タスクを入力して下さい。";

        }

        return "";
    }

    private static String _validateDeadline(Date deadline){
        if(deadline == null || deadline.equals("")){
            return "期限を入力してください。";
       }

        return "";
    }
}

