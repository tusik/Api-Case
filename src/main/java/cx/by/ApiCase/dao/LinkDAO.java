package cx.by.ApiCase.dao;

import cx.by.ApiCase.model.Link;
import cx.by.ApiCase.repo.LinkRepo;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import java.util.List;
import java.util.Optional;

public class LinkDAO implements LinkRepo {
    @Override
    public List<Link> findAll() {
        return null;
    }

    @Override
    public List<Link> findAll(Sort sort) {
        return null;
    }

    @Override
    public Page<Link> findAll(Pageable pageable) {
        return null;
    }

    @Override
    public List<Link> findAllById(Iterable<Integer> iterable) {
        return null;
    }

    @Override
    public long count() {
        return 0;
    }

    @Override
    public void deleteById(Integer integer) {

    }

    @Override
    public void delete(Link link) {

    }

    @Override
    public void deleteAll(Iterable<? extends Link> iterable) {

    }

    @Override
    public void deleteAll() {

    }

    @Override
    public <S extends Link> S save(S s) {
        return null;
    }

    @Override
    public <S extends Link> List<S> saveAll(Iterable<S> iterable) {
        return null;
    }

    @Override
    public Optional<Link> findById(Integer integer) {
        return Optional.empty();
    }

    @Override
    public boolean existsById(Integer integer) {
        return false;
    }

    @Override
    public void flush() {

    }

    @Override
    public <S extends Link> S saveAndFlush(S s) {
        return null;
    }

    @Override
    public void deleteInBatch(Iterable<Link> iterable) {

    }

    @Override
    public void deleteAllInBatch() {

    }

    @Override
    public Link getOne(Integer integer) {
        return null;
    }

    @Override
    public <S extends Link> Optional<S> findOne(Example<S> example) {
        return Optional.empty();
    }

    @Override
    public <S extends Link> List<S> findAll(Example<S> example) {
        return null;
    }

    @Override
    public <S extends Link> List<S> findAll(Example<S> example, Sort sort) {
        return null;
    }

    @Override
    public <S extends Link> Page<S> findAll(Example<S> example, Pageable pageable) {
        return null;
    }

    @Override
    public <S extends Link> long count(Example<S> example) {
        return 0;
    }

    @Override
    public <S extends Link> boolean exists(Example<S> example) {
        return false;
    }
}
