package com.example.zuulservice.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;

@Component
@Slf4j
public class ZuulLoggingFilter extends ZuulFilter {

    /**
     * 실제 필터 작동시 실행되는 메서드!
     * @return
     * @throws ZuulException
     */
    @Override
    public Object run() throws ZuulException {
        log.info("************* printing logs : ");
        // HttpServletRequest, HttpServletResponse의 상위객체 RequestContext
        HttpServletRequest request = RequestContext.getCurrentContext().getRequest();
        log.info("************* : "+ request.getRequestURI());
        return null;
    }

    /**
     * 사전필터 혹은 사후필터를 결정하는 함수
     * @return
     */
    @Override
    public String filterType() {
        return "pre";
    }

    /**
     * filter의 순서를 정하는
     * @return
     */
    @Override
    public int filterOrder() {
        return 1;
    }

    /**
     * 필터의 필수 혹은 선택 (true: 필수, false: 선)
     * @return
     */
    @Override
    public boolean shouldFilter() {
        return true;
    }
}
