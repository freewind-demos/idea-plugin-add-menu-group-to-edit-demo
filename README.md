Idea Plugin Add Sub Menu Group to Edit Menu Demo
================================================

Add sub menu group to existing `Edit` menu, like:

```
Edit
----
...
...
...
...
idea-plugin-add-menu-group-to-edit-demo > Popup1
                                          Popup2
                                          Popup3
```

The key option is `popup="true"` in `<group>` in `plugin.xml`. If it's not specified or is `false`, there will be no sub menu group, instead, it's:

```
Edit
----
...
...
...
...
Popup1
Popup2
Popup3
```

Run plugin
----------

```
./gradlew runIde
```
