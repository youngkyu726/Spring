<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

    <section>
        <div class="container">
            <div class="row">
                <div class="col-xs-12 col-md-9 write-wrap">
                        <div class="titlebox">
                            <p>수정하기</p>
                        </div>
                        
                        <form action="updateForm" method="post" name="updateForm">
                            <div>
                                <label>DATE</label>
                                <p>
								<fmt:formatDate value="${vo.regdate }" pattern="yyy-MM-dd hh시mm분" />
								</p>
							
							<!-- readonly는 폼전송이 가능합니다. disabled는 폼전송이 불가합니다. -->
                            </div>   
                            <div class="form-group">
                                <label>번호</label>
                                <input class="form-control" name='bno' value="${vo.bno }" readonly>
                            </div>
                            <div class="form-group">
                                <label>작성자</label>
                                <input class="form-control" name='writer' value="${vo.writer } " readonly>
                            </div>    
                            <div class="form-group">
                                <label>제목</label>
                                <input class="form-control" name='title' value="${vo.title }">
                            </div>

                            <div class="form-group">
                                <label>내용</label>
                                <textarea class="form-control" rows="10" name='content'>${vo.content }</textarea>
                            </div>

                            <button type="button" class="btn btn-dark" onclick="location.href='freeList'">목록</button>    
                            <button type="button" class="btn btn-primary" onclick="updateHandler()">저장</button>
                            <button type="button" class="btn btn-info" onclick="deleteHandler()">삭제</button>
                    </form>
                                    
                </div>
            </div>
        </div>
        </section>
      
      <script>
      	function updateHandler() {
      		if(document.updateForm.writer.value ==''){
      			alert("작성자는 필수 입니다");
      			document.updateForm.writer.focus(); //포커싱
      			return;
      		} else if(document.updateForm.title.value ==''){
      			alert("제목은 필수 입니다");
      			document.updateForm.title.focus();
      			return;
      		} else if (document.updateForm.content.value ==''){
      			alert("내용은 필수 입니다");
      			document.updateForm.content.focus();
      			return;
      		} else {
      			document.updateForm.action = "updateForm";
      			document.updateForm.submit(); //서브밋
      		}
      	}
      	
      	function deleteHandler() {
      		document.updateForm.action = "deleteForm"; //액션값 변경
      		document.updateForm.submit();
      	}
      	//메시지 처리
      	(function() {      		
			var msg = '${msg}';
			if(msg != '') {
				alert(msg);			
			}
      	})();
      </script>