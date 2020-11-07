package com.javabom.toby.chapter1.pattern.추상_팩토리_패턴;

public class ArticleDaoFactory extends DaoFactory {

    @Override
    public Dao createDao() {
        return new ArticleDao();
    }
}
