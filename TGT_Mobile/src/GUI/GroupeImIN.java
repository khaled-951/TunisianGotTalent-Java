/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import Entities.fos_user;
import Services.ServiceGroupe;
import com.codename1.ui.Form;
import com.codename1.ui.util.Resources;

/**
 *
 * @author HP
 */
public class GroupeImIN extends Form{

    public GroupeImIN(Form previous,Resources theme,fos_user u) {
        setTitle("Groupe I m in");
        
        //SpanLabel sp = new SpanLabel();
       this.add(ServiceGroupe.getInstance().getList2(theme,u.getId().toString()));
       // add(sp);
        //getToolbar().addMaterialCommandToLeftBar("", FontImage.MATERIAL_ARROW_BACK, e-> previous.showBack());
    }
    
}