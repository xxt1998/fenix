package com.blinkfox.fenix.specification.handler.impl;

import com.blinkfox.fenix.specification.handler.AbstractPredicateHandler;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.From;
import javax.persistence.criteria.Predicate;

/**
 * 构建“是 NULL 条件”({@code field IS NULL})场景的 Specification 监听器.
 *
 * @author YangWenpeng on 2019-12-17
 * @author blinkfox on 2020-01-14
 * @since v2.2.0
 */
public class IsNullSpecificationHandler extends AbstractPredicateHandler {

//    @Override
//    protected <Z, X> Predicate buildPredicate(
//            CriteriaBuilder criteriaBuilder, From<Z, X> from, String name, Object value, Object annotation) {
//        return criteriaBuilder.and(criteriaBuilder.isNull(from.get(String.valueOf(value))));
//    }
//
//    @Override
//    protected <Z, X> Predicate buildPredicate(CriteriaBuilder criteriaBuilder, From<Z, X> from, String fieldName, Object value) {
//        return null;
//    }
//
//    @SuppressWarnings("unchecked")
//    @Override
//    public Class<IsNull> getAnnotation() {
//        return IsNull.class;
//    }

    @Override
    protected <T> Class<T> getAndAnnotation() {
        return null;
    }

    @Override
    protected <T> Class<T> getAndNotAnnotation() {
        return null;
    }

    @Override
    protected <T> Class<T> getOrAnnotation() {
        return null;
    }

    @Override
    protected <T> Class<T> getOrNotAnnotation() {
        return null;
    }

    @Override
    protected <Z, X> Predicate buildAndPredicate(CriteriaBuilder criteriaBuilder, From<Z, X> from, String fieldName, Object value, Object annotation) {
        return null;
    }

    @Override
    protected <Z, X> Predicate buildAndPredicate(CriteriaBuilder criteriaBuilder, From<Z, X> from, String fieldName, Object value) {
        return null;
    }

    @Override
    protected <Z, X> Predicate buildAndNotPredicate(CriteriaBuilder criteriaBuilder, From<Z, X> from, String fieldName, Object value, Object annotation) {
        return null;
    }

    @Override
    protected <Z, X> Predicate buildAndNotPredicate(CriteriaBuilder criteriaBuilder, From<Z, X> from, String fieldName, Object value) {
        return null;
    }

    @Override
    protected <Z, X> Predicate buildOrPredicate(CriteriaBuilder criteriaBuilder, From<Z, X> from, String fieldName, Object value, Object annotation) {
        return null;
    }

    @Override
    protected <Z, X> Predicate buildOrPredicate(CriteriaBuilder criteriaBuilder, From<Z, X> from, String fieldName, Object value) {
        return null;
    }

    @Override
    protected <Z, X> Predicate buildOrNotPredicate(CriteriaBuilder criteriaBuilder, From<Z, X> from, String fieldName, Object value, Object annotation) {
        return null;
    }

    @Override
    protected <Z, X> Predicate buildOrNotPredicate(CriteriaBuilder criteriaBuilder, From<Z, X> from, String fieldName, Object value) {
        return null;
    }
}
