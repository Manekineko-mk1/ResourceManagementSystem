package concordia.soen387.project.Controllers;

import concordia.soen387.project.Model.Resource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;

@Controller
public class InvViewController {
	
	private ModelAndView modelAndView = new ModelAndView();
	//private InvNavigationBarService invNavigationBarService = new InvNavigationBarService();
	
	//accountSettings
	@RequestMapping(value = "/manageInventory")
	public ModelAndView manageInventory(ArrayList<Resource> resourceArrayList, String msg){
		modelAndView.setViewName("inventory/invIndex");
		modelAndView.addObject("manageInventoryTabActive", "active");
		modelAndView.addObject("accountSettingsTabActive", "");
		modelAndView.addObject("addInventoryTabActive","");
		modelAndView.addObject("selectedTab", "../../jsp/inventory/manageInventory.jsp");
		if(resourceArrayList != null) {
			modelAndView.addObject("resourceList", resourceArrayList);
			modelAndView.addObject("errorMsg", msg);
		}else {
			modelAndView.addObject("errorMsg", msg);
		}
		return modelAndView;
		
	}
	//addComputertab
	@RequestMapping(value = "/accountSetting")
	public ModelAndView accountSetting(){
		modelAndView.setViewName("inventory/invIndex");
		modelAndView.addObject("accountSettingsTabActive", "active");
		modelAndView.addObject("manageInventoryTabActive","");
		modelAndView.addObject("addInventoryTabActive","");
		modelAndView.addObject("selectedTab", "../../jsp/inventory/accountSettings.jsp");
		return modelAndView;
		
	}
	@RequestMapping(value = "/addInventory")
	public ModelAndView addInventory(){
		modelAndView.setViewName("inventory/invIndex");
		modelAndView.addObject("accountSettingsTabActive", "");
		modelAndView.addObject("addInventoryTabActive","active");
		modelAndView.addObject("manageInventoryTabActive","");
		modelAndView.addObject("selectedTab", "../../jsp/inventory/addInventoryForm.jsp");
		return modelAndView;

	}

	/*
	
	//addBoard
	@RequestMapping(value = "/addBoardTab")
	public ModelAndView addBoardNav(){
		modelAndView.setViewName("invIndex");
		modelAndView.addObject("accountSettingsTabActive", "");
		modelAndView.addObject("addComputerTabActive","");
		modelAndView.addObject("addBoardTabActive", "active");
		modelAndView.addObject("addRoomTabActive","");
		modelAndView.addObject("addProjectorTabActive","");
		modelAndView.addObject("editItemTabActive", "");
		modelAndView.addObject("selectedTab", "../jsp/inventory/boardform.jsp");
		return modelAndView;
		
	}
	
	//addRoom
	@RequestMapping(value = "/addRoomTab")
	public ModelAndView addRoomNav(){
		modelAndView.setViewName("invIndex");
		modelAndView.addObject("accountSettingsTabActive", "");
		modelAndView.addObject("addComputerTabActive","");
		modelAndView.addObject("addBoardTabActive", "");
		modelAndView.addObject("addRoomTabActive","active");
		modelAndView.addObject("addProjectorTabActive","");
		modelAndView.addObject("editItemTabActive", "");
		modelAndView.addObject("selectedTab", "../jsp/inventory/roomform.jsp");
		return modelAndView;
		
	}
	
	//addProjector
	@RequestMapping(value = "/addProjectorTab")
	public ModelAndView addProjectorNav(){
		modelAndView.setViewName("invIndex");
		modelAndView.addObject("accountSettingsTabActive", "");
		modelAndView.addObject("addComputerTabActive","");
		modelAndView.addObject("addBoardTabActive", "");
		modelAndView.addObject("addRoomTabActive","active");
		modelAndView.addObject("addProjectorTabActive","active");
		modelAndView.addObject("editItemTabActive", "");
		modelAndView.addObject("selectedTab", "../jsp/inventory/projectorform.jsp");
		return modelAndView;
		
	}
	
	//editItem
	@RequestMapping(value = "/editItemTab")
	public ModelAndView editItemNav(){
		modelAndView.setViewName("invIndex");
		modelAndView.addObject("accountSettingsTabActive", "");
		modelAndView.addObject("addComputerTabActive","");
		modelAndView.addObject("addBoardTabActive", "");
		modelAndView.addObject("addRoomTabActive","");
		modelAndView.addObject("addProjectorTabActive","");
		modelAndView.addObject("editItemTabActive", "active");
		modelAndView.addObject("selectedTab", "../jsp/inventory/editItem.jsp");
		return modelAndView;
		
	}
	*/

}