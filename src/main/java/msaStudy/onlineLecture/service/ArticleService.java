package msaStudy.onlineLecture.service;

import msaStudy.onlineLecture.domain.Article;
import msaStudy.onlineLecture.domain.Comment;

import java.lang.reflect.Member;
import java.util.List;
import java.util.Map;

public interface ArticleService {
    public List<Article> articleList() throws Exception;
    public Map<String, String> articleRegister(Article article) throws Exception;
    public Map<String, String> articleSetShowYn(Long articleId, String showYn) throws Exception;
    public Map<String, String> commentRegister(Comment comment) throws Exception;
    public Map<String, String> commentSetShowYn(Long commentId, String showYn) throws Exception;


}
