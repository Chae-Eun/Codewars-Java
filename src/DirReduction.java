/**************************MY SOLUTION******************************/
import java.util.ArrayList;
import java.util.Arrays;

public class DirReduction {
    public static String[] dirReduc(String[] arr) {
        ArrayList<String> direct = new ArrayList(Arrays.asList(arr));

        for (int i = 0; i < direct.size()-1; i++){
            switch (direct.get(i)){
                case "NORTH":
                    if(direct.get(i+1) == "SOUTH"){
                        direct.remove(i+1);
                        direct.remove(i);
                        i = -1;
                    }
                    break;
                case "SOUTH":
                    if(direct.get(i+1) == "NORTH"){
                        direct.remove(i+1);
                        direct.remove(i);
                        i = -1;
                    }
                    break;
                case "EAST":
                    if(direct.get(i+1) == "WEST"){
                        direct.remove(i+1);
                        direct.remove(i);
                        i = -1;
                    }
                    break;
                case "WEST":
                    if(direct.get(i+1) == "EAST"){
                        direct.remove(i+1);
                        direct.remove(i);
                        i = -1;
                    }
                    break;
            }
        }

        return direct.toArray(new String[direct.size()]);
    }
}

/************************BEST SOLUTION******************************/
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DirReduction {
    public static String[] dirReduc(String[] arr) {
        List<String> dirs = new ArrayList<String>(Arrays.asList(arr));
        for (int i = 0; i + 1 < dirs.size(); i++) {
            if ("NORTHSOUTH,SOUTHNORTH,EASTWEST,WESTEAST".contains(dirs.get(i) + dirs.get(i + 1))) {
                dirs.remove(i + 1);
                dirs.remove(i);
                i = -1;
            }
        }
        return dirs.toArray(new String[dirs.size()]);
    }
}

import java.util.Stack;

public class DirReduction {
    public static String[] dirReduc(String[] arr) {
        final Stack<String> stack = new Stack<>();

        for (final String direction : arr) {
            final String lastElement = stack.size() > 0 ? stack.lastElement() : null;

            switch(direction) {
                case "NORTH": if ("SOUTH".equals(lastElement)) { stack.pop(); } else { stack.push(direction); } break;
                case "SOUTH": if ("NORTH".equals(lastElement)) { stack.pop(); } else { stack.push(direction); } break;
                case "EAST":  if ("WEST".equals(lastElement)) { stack.pop(); } else { stack.push(direction); } break;
                case "WEST":  if ("EAST".equals(lastElement)) { stack.pop(); } else { stack.push(direction); } break;
            }
        }
        return stack.stream().toArray(String[]::new);
    }
}
/*******************************************************************/