package liquibase.parser.text;

import liquibase.exception.ParseException;
import liquibase.parser.AbstractUnparser;

import java.io.OutputStream;

public class StringChangeLogUnparser extends AbstractUnparser {

    private static final int INDENT_LENGTH = 4;

//    private FieldFilter fieldFilter;

//    public StringChangeLogUnparser() {
//        this(new FieldFilter());
//    }

//    public StringChangeLogUnparser(FieldFilter fieldFilter) {
//        this.fieldFilter = fieldFilter;
//    }

    @Override
    public int getPriority(String path) {
        if (path.endsWith(".txt")) {
            return PRIORITY_DEFAULT;
        }
        return PRIORITY_NOT_APPLICABLE;
    }

    @Override
    public void unparse(Object object, String outputPath, OutputStream outputStream) throws ParseException {
//        try {
//            StringBuffer buffer = new StringBuffer();
//            buffer.append("[");
//
//            SortedSet<String> values = new TreeSet<>();
//            for (String field : objectToSerialize.getSerializableFields()) {
//                Object value = objectToSerialize.getSerializableFieldValue(field);
//                if (value == null) {
//                    continue;
//                }
//                if (!fieldFilter.include(objectToSerialize, field, value)) {
//                    continue;
//                }
//                if (value instanceof LiquibaseSerializable) {
//                    values.add(indent(indent) + serializeObject((LiquibaseSerializable) value, indent + 1));
//                } else {
//                    if (value != null) {
//                        if (value instanceof Map) {
//                            values.add(indent(indent) + field + "=" + serializeObject((Map) value, indent + 1));
//                        } else if (value instanceof Collection) {
//                            values.add(indent(indent) + field + "=" + serializeObject((Collection) value, indent + 1));
//                        } else if (value instanceof Object[]) {
//                            values.add(indent(indent) + field + "=" + serializeObject((Object[]) value, indent + 1));
//                        } else {
//                            String valueString = value.toString();
//                            if ((value instanceof Double) || (value instanceof Float)) { //java 6 adds additional zeros to the end of doubles and floats
//                                if (valueString.contains(".")) {
//                                    valueString = valueString.replaceFirst("(\\.[0-9]+)0+$","$1");
//                                    valueString = valueString.replaceFirst("\\.0+$", "");
//                                }
//                            }
//                            values.add(indent(indent) + field + "=\"" + valueString + "\"");
//                        }
//                    }
//                }
//            }
//
//            if (!values.isEmpty()) {
//                buffer.append("\n");
//                buffer.append(StringUtil.join(values, "\n"));
//                buffer.append("\n");
//            }
//            buffer.append(indent(indent - 1)).append("]");
//            return buffer.toString().replace("\r\n", "\n").replace("\r", "\n"); //standardize all newline chars
//
//        } catch (Exception e) {
//            throw new UnexpectedLiquibaseException(e);
//        }

    }
//
//    private String indent(int indent) {
//        return StringUtil.repeat(" ", INDENT_LENGTH * indent);
//    }
//
//    private String serializeObject(Object[] collection, int indent) {
//        if (collection.length == 0) {
//            return "[]";
//        }
//
//        String returnString = "[\n";
//        for (Object object : collection) {
//            if (object instanceof LiquibaseSerializable) {
//                returnString += indent(indent) + serializeObject((LiquibaseSerializable) object, indent + 1) + ",\n";
//            } else {
//                returnString += indent(indent) + object.toString() + ",\n";
//            }
//        }
//        returnString = returnString.replaceFirst(",$", "");
//        returnString += indent(indent - 1) + "]";
//
//        return returnString;
//
//    }
//
//    private String serializeObject(Collection collection, int indent) {
//        if (collection.isEmpty()) {
//            return "[]";
//        }
//
//        String returnString = "[\n";
//        for (Object object : collection) {
//            if (object instanceof LiquibaseSerializable) {
//                returnString += indent(indent) + serializeObject((LiquibaseSerializable) object, indent + 1) + ",\n";
//            } else {
//                returnString += indent(indent) + object.toString() + ",\n";
//            }
//        }
//        returnString = returnString.replaceFirst(",$", "");
//        returnString += indent(indent - 1) + "]";
//
//        return returnString;
//
//    }
//
//    private String serializeObject(Map collection, int indent) {
//        if (collection.isEmpty()) {
//            return "[]";
//        }
//
//        String returnString = "{\n";
//        for (Object key : new TreeSet(collection.keySet())) {
//            returnString += indent(indent) + key.toString() + "=\"" + collection.get(key) + "\",\n";
//        }
//        returnString = returnString.replaceFirst(",$", "");
//        returnString += indent(indent - 1) + "}";
//
//        return returnString;
//
//    }
//
//    @Override
//    public <T extends ChangeLogEntry> void write(List<T> children, OutputStream out) throws IOException {
//
//    }
//
//    @Override
//    public void append(ChangeSet changeSet, File changeLogFile) throws IOException {
//
//    }
//
//    @Override
//    public int getPriority() {
//        return PRIORITY_DEFAULT;
//    }
//
//    public static class FieldFilter {
//        public boolean include(Object obj, String field, Object value) {
//            return true;
//        }
//    }
}