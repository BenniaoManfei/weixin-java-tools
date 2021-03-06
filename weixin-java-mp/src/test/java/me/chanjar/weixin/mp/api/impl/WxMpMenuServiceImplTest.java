package me.chanjar.weixin.mp.api.impl;

import com.google.inject.Inject;
import me.chanjar.weixin.common.api.WxConsts;
import me.chanjar.weixin.common.bean.WxMenu;
import me.chanjar.weixin.common.bean.WxMenu.WxMenuButton;
import me.chanjar.weixin.common.exception.WxErrorException;
import me.chanjar.weixin.mp.api.ApiTestModule;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Guice;
import org.testng.annotations.Test;

/**
 * 测试菜单
 * @author chanjarster
 * @author Binary Wang
 *
 */
@Test(groups="menuAPI")
@Guice(modules = ApiTestModule.class)
public class WxMpMenuServiceImplTest {

  @Inject
  protected WxMpServiceImpl wxService;
  
  @Test(dataProvider = "menu")
  public void testCreateMenu(WxMenu wxMenu) throws WxErrorException {
    System.out.println(wxMenu.toJson());
    this.wxService.getMenuService().menuCreate(wxMenu);
  }

  @Test
  public void testCreateMenu2() throws WxErrorException {
    String a = "{\n"
        + "  \"menu\": {\n"
        + "    \"button\": [\n"
        + "      {\n"
        + "        \"type\": \"click\",\n"
        + "        \"name\": \"今日歌曲\",\n"
        + "        \"key\": \"V1001_TODAY_MUSIC\"\n"
        + "      },\n"
        + "      {\n"
        + "        \"type\": \"click\",\n"
        + "        \"name\": \"歌手简介\",\n"
        + "        \"key\": \"V1001_TODAY_SINGER\"\n"
        + "      },\n"
        + "      {\n"
        + "        \"name\": \"菜单\",\n"
        + "        \"sub_button\": [\n"
        + "          {\n"
        + "            \"type\": \"view\",\n"
        + "            \"name\": \"搜索\",\n"
        + "            \"url\": \"http://www.soso.com/\"\n"
        + "          },\n"
        + "          {\n"
        + "            \"type\": \"view\",\n"
        + "            \"name\": \"视频\",\n"
        + "            \"url\": \"http://v.qq.com/\"\n"
        + "          },\n"
        + "          {\n"
        + "            \"type\": \"click\",\n"
        + "            \"name\": \"赞一下我们\",\n"
        + "            \"key\": \"V1001_GOOD\"\n"
        + "          }\n"
        + "        ]\n"
        + "      }\n"
        + "    ]\n"
        + "  }\n"
        + "}";

    WxMenu menu = WxMenu.fromJson(a);
    System.out.println(menu.toJson());
    this.wxService.getMenuService().menuCreate(menu);
  }

  @Test(dependsOnMethods = { "testCreateMenu"})
  public void testGetMenu() throws WxErrorException {
    WxMenu wxMenu = this.wxService.getMenuService().menuGet();
    Assert.assertNotNull(wxMenu);
    System.out.println(wxMenu.toJson());
  }
  
  @Test(dependsOnMethods = { "testGetMenu"})
  public void testDeleteMenu() throws WxErrorException {
    this.wxService.getMenuService().menuDelete();
  }
  
  @DataProvider(name="menu")
  public Object[][] getMenu() {
    WxMenu menu = new WxMenu();
    WxMenuButton button1 = new WxMenuButton();
    button1.setType(WxConsts.BUTTON_CLICK);
    button1.setName("今日歌曲");
    button1.setKey("V1001_TODAY_MUSIC");
    
    WxMenuButton button2 = new WxMenuButton();
    button2.setType(WxConsts.BUTTON_CLICK);
    button2.setName("歌手简介");
    button2.setKey("V1001_TODAY_SINGER");
    
    WxMenuButton button3 = new WxMenuButton();
    button3.setName("菜单");
    
    menu.getButtons().add(button1);
    menu.getButtons().add(button2);
    menu.getButtons().add(button3);
    
    WxMenuButton button31 = new WxMenuButton();
    button31.setType(WxConsts.BUTTON_VIEW);
    button31.setName("搜索");
    button31.setUrl("http://www.soso.com/");
    
    WxMenuButton button32 = new WxMenuButton();
    button32.setType(WxConsts.BUTTON_VIEW);
    button32.setName("视频");
    button32.setUrl("http://v.qq.com/");
    
    WxMenuButton button33 = new WxMenuButton();
    button33.setType(WxConsts.BUTTON_CLICK);
    button33.setName("赞一下我们");
    button33.setKey("V1001_GOOD");
    
    button3.getSubButtons().add(button31);
    button3.getSubButtons().add(button32);
    button3.getSubButtons().add(button33);
    
    return new Object[][] {
        new Object[] {
            menu
        }
    };
  
  }
  
  
}
