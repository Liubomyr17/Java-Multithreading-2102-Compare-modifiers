package com.company;

/*

2102 Compare modifiers
Implement the logic of the isAllModifiersContainSpecificModifier method, which checks whether the passed parameter allModifiers contains the value of a specific modifier specificModifier.
P.S. Before completing the task, familiarize yourself with the Modifier class and the implementation of the isPublic, isStatic methods, etc.

Requirements:
1. The isAllModifiersContainSpecificModifier method must be static.
2. The isAllModifiersContainSpecificModifier method should return a boolean value.
3. The isAllModifiersContainSpecificModifier method must accept two parameters of type int.
4. The isAllModifiersContainSpecificModifier method must return the correct value in accordance with the task condition (true if the specified modifier is present in allModifiers, otherwise false).



 */

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;


    public class Solution {
        public static void main(String[] args) {
            int modifiersOfThisClass = Solution.class.getModifiers();
            System.out.println(isAllModifiersContainSpecificModifier(modifiersOfThisClass, Modifier.PUBLIC));   //true
            System.out.println(isAllModifiersContainSpecificModifier(modifiersOfThisClass, Modifier.STATIC));   //false

            int modifiersOfMethod = getMainMethod().getModifiers();
            System.out.println(isAllModifiersContainSpecificModifier(modifiersOfMethod, Modifier.STATIC));      //true
        }

        public static boolean isAllModifiersContainSpecificModifier(int allModifiers, int specificModifier) {
            if (Modifier.isAbstract(allModifiers) && Modifier.isAbstract(specificModifier))
                return true;

            if (Modifier.isFinal(allModifiers) && Modifier.isFinal(specificModifier))
                return true;

            if (Modifier.isInterface(allModifiers) && Modifier.isInterface(specificModifier))
                return true;

            if (Modifier.isNative(allModifiers) && Modifier.isNative(specificModifier))
                return true;

            if (Modifier.isPrivate(allModifiers) && Modifier.isPrivate(specificModifier))
                return true;

            if (Modifier.isProtected(allModifiers) && Modifier.isProtected(specificModifier))
                return true;

            if (Modifier.isPublic(allModifiers) && Modifier.isPublic(specificModifier))
                return true;

            if (Modifier.isStatic(allModifiers) && Modifier.isStatic(specificModifier))
                return true;

            if (Modifier.isStrict(allModifiers) && Modifier.isStrict(specificModifier))
                return true;

            if (Modifier.isSynchronized(allModifiers) && Modifier.isSynchronized(specificModifier))
                return true;

            if (Modifier.isTransient(allModifiers) && Modifier.isTransient(specificModifier))
                return true;

            if (Modifier.isVolatile(allModifiers) && Modifier.isVolatile(specificModifier))
                return true;

            if (Modifier.isVolatile(allModifiers) && Modifier.isVolatile(specificModifier))
                return true;

            return false;
        }

        private static Method getMainMethod() {
            Method[] methods = Solution.class.getDeclaredMethods();
            for (Method method : methods) {
                if (method.getName().equalsIgnoreCase("main")) return method;
            }

            return null;
        }
    }

