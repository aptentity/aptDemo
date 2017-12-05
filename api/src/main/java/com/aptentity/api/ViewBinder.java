package com.aptentity.api;

/**
 * Created by gulliver on 2017/12/5.
 */

public interface ViewBinder<T> {
    void bindView(T host, Object object, ViewFinder finder);

    void unBindView(T host);
}
