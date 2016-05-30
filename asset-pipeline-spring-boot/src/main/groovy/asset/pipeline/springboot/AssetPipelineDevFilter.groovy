package asset.pipeline.springboot


import asset.pipeline.servlet.AssetPipelineDevFilterCore
import groovy.util.logging.Log4j
import javax.servlet.Filter
import javax.servlet.FilterChain
import javax.servlet.FilterConfig
import javax.servlet.ServletException
import javax.servlet.ServletRequest
import javax.servlet.ServletResponse


@Log4j
class AssetPipelineDevFilter implements Filter {
	AssetPipelineDevFilterCore assetPipelineDevFilterCoreStandalone = new AssetPipelineDevFilterCore()

	void init(FilterConfig config) throws ServletException {
		assetPipelineDevFilterCoreStandalone.servletContext = config.servletContext
		assetPipelineDevFilterCoreStandalone.mapping = "assets"
	}

	void destroy() {
	}

	void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		assetPipelineDevFilterCoreStandalone.doFilter(request, response, chain)
	}

}
