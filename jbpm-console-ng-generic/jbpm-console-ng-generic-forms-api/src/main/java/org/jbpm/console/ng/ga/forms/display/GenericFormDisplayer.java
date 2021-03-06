/*
 * Copyright 2014 JBoss by Red Hat.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.jbpm.console.ng.ga.forms.display;

import com.google.gwt.user.client.ui.IsWidget;
import com.google.gwt.user.client.ui.Panel;
import org.jbpm.console.ng.ga.service.ItemKey;
import org.jbpm.console.ng.ga.forms.display.view.FormContentResizeListener;
import org.uberfire.mvp.Command;

/**
 *
 * @author salaboy
 * @param <T>
 */
public interface GenericFormDisplayer<T extends ItemKey> {
    boolean supportsContent(String content);

    void init(FormDisplayerConfig<T> config, Command onCloseCommand, Command onRefreshCommand, FormContentResizeListener formContentResizeListener);

    Panel getContainer();

    IsWidget getFooter();

    void addOnCloseCallback(Command callback);
    
    void addOnRefreshCallback(Command callback);

    int getPriority();

    void close();

    String getOpener();
}
