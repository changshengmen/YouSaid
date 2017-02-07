package priv.suns.ys.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author sunshuo
 *
 */
@Controller
@RequestMapping(value="/")
public class IndexAction
{		
	/**
	 * 
	* @param
	* @Description: 跳转到登陆页面 
	* @author sunshuo
	* @date 2016年12月2日 下午4:42:00 
	* @return String    返回类型 
	* @throws
	 */
	@RequestMapping({"/","/index"})
	public String index(Model model){
		model.addAttribute("msg", "2");
		return "redirect:/login";		
	}
	/**
	 * 
	* @param
	* @Description: 非登陆模式浏览网站 
	* @author sunshuo
	* @date 2016年12月2日 下午4:49:14 
	* @return String    返回类型 
	* @throws
	 */
	@RequestMapping(value="/noLogin")
	public String noLogin(){
		return "login/login";
	}
	/**
	 * 
	* @param
	* @Description: 登陆 
	* @author sunshuo
	* @date 2016年12月2日 下午4:54:45 
	* @return String    返回类型 
	* @throws
	 */
	public String Login(){
		return "login/login";
	}
	/**
	 * 
	* @param
	* @Description: 忘记密码 
	* @author sunshuo
	* @date 2016年12月2日 下午4:56:31 
	* @return String    返回类型 
	* @throws
	 */
	public String Forget(){
		return "login/forgetPass";
	}
	/**
	 * 
	* @param
	* @Description: 注册 
	* @author sunshuo
	* @date 2016年12月2日 下午4:58:54 
	* @return String    返回类型 
	* @throws
	 */
	public String register(){
		return "login/register";
	}
}
