<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<label for ="content">タスク</label><br />
<input type="text" name="content" value="${task.content}" />
<br /><br />

<label for ="deadline">期限</label><br />
<input type="date" name="deadline" value="${task.deadline}" required pattern="[0-9]{4}-[0-9]{2}-[0-9]{2}"/>
<br /><br />

<input type="hidden" name="_token" value="${_token}" />
<button type="submit">投稿</button>