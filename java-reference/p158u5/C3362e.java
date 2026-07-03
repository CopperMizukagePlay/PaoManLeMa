package p158u5;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import p005a6.InterfaceC0111b;
import p024c6.AbstractC0444k;
import p053g5.C1687f;
import p060h5.AbstractC1806n;
import p060h5.AbstractC1807o;
import p060h5.AbstractC1817y;
import p066i3.AbstractC2067b;
import p145t0.InterfaceC3171b;
import p150t5.InterfaceC3277a;
import p150t5.InterfaceC3278b;
import p150t5.InterfaceC3279c;
import p150t5.InterfaceC3280d;
import p150t5.InterfaceC3281e;
import p150t5.InterfaceC3282f;
import p150t5.InterfaceC3283g;
import p150t5.InterfaceC3284h;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: u5.e */
/* loaded from: classes.dex */
public final class C3362e implements InterfaceC0111b, InterfaceC3361d {

    /* renamed from: b */
    public static final Map f16437b;

    /* renamed from: c */
    public static final LinkedHashMap f16438c;

    /* renamed from: a */
    public final Class f16439a;

    static {
        List m3067O = AbstractC1806n.m3067O(InterfaceC3277a.class, InterfaceC3279c.class, InterfaceC3281e.class, InterfaceC3282f.class, InterfaceC3283g.class, InterfaceC3284h.class, InterfaceC3171b.class, InterfaceC3171b.class, InterfaceC3171b.class, InterfaceC3171b.class, InterfaceC3171b.class, InterfaceC3171b.class, InterfaceC3278b.class, InterfaceC3171b.class, InterfaceC3171b.class, InterfaceC3171b.class, InterfaceC3171b.class, InterfaceC3171b.class, InterfaceC3171b.class, InterfaceC3171b.class, InterfaceC3171b.class, InterfaceC3171b.class, InterfaceC3280d.class);
        ArrayList arrayList = new ArrayList(AbstractC1807o.m3073U(m3067O));
        int i7 = 0;
        for (Object obj : m3067O) {
            int i8 = i7 + 1;
            if (i7 >= 0) {
                arrayList.add(new C1687f((Class) obj, Integer.valueOf(i7)));
                i7 = i8;
            } else {
                AbstractC1806n.m3072T();
                throw null;
            }
        }
        f16437b = AbstractC1817y.m3086R(arrayList);
        HashMap hashMap = new HashMap();
        hashMap.put("boolean", "kotlin.Boolean");
        hashMap.put("char", "kotlin.Char");
        hashMap.put("byte", "kotlin.Byte");
        hashMap.put("short", "kotlin.Short");
        hashMap.put("int", "kotlin.Int");
        hashMap.put("float", "kotlin.Float");
        hashMap.put("long", "kotlin.Long");
        hashMap.put("double", "kotlin.Double");
        HashMap hashMap2 = new HashMap();
        hashMap2.put("java.lang.Boolean", "kotlin.Boolean");
        hashMap2.put("java.lang.Character", "kotlin.Char");
        hashMap2.put("java.lang.Byte", "kotlin.Byte");
        hashMap2.put("java.lang.Short", "kotlin.Short");
        hashMap2.put("java.lang.Integer", "kotlin.Int");
        hashMap2.put("java.lang.Float", "kotlin.Float");
        hashMap2.put("java.lang.Long", "kotlin.Long");
        hashMap2.put("java.lang.Double", "kotlin.Double");
        HashMap hashMap3 = new HashMap();
        hashMap3.put("java.lang.Object", "kotlin.Any");
        hashMap3.put("java.lang.String", "kotlin.String");
        hashMap3.put("java.lang.CharSequence", "kotlin.CharSequence");
        hashMap3.put("java.lang.Throwable", "kotlin.Throwable");
        hashMap3.put("java.lang.Cloneable", "kotlin.Cloneable");
        hashMap3.put("java.lang.Number", "kotlin.Number");
        hashMap3.put("java.lang.Comparable", "kotlin.Comparable");
        hashMap3.put("java.lang.Enum", "kotlin.Enum");
        hashMap3.put("java.lang.annotation.Annotation", "kotlin.Annotation");
        hashMap3.put("java.lang.Iterable", "kotlin.collections.Iterable");
        hashMap3.put("java.util.Iterator", "kotlin.collections.Iterator");
        hashMap3.put("java.util.Collection", "kotlin.collections.Collection");
        hashMap3.put("java.util.List", "kotlin.collections.List");
        hashMap3.put("java.util.Set", "kotlin.collections.Set");
        hashMap3.put("java.util.ListIterator", "kotlin.collections.ListIterator");
        hashMap3.put("java.util.Map", "kotlin.collections.Map");
        hashMap3.put("java.util.Map$Entry", "kotlin.collections.Map.Entry");
        hashMap3.put("kotlin.jvm.internal.StringCompanionObject", "kotlin.String.Companion");
        hashMap3.put("kotlin.jvm.internal.EnumCompanionObject", "kotlin.Enum.Companion");
        hashMap3.putAll(hashMap);
        hashMap3.putAll(hashMap2);
        Collection<String> values = hashMap.values();
        AbstractC3367j.m5099d(values, "<get-values>(...)");
        for (String str : values) {
            StringBuilder sb = new StringBuilder("kotlin.jvm.internal.");
            AbstractC3367j.m5097b(str);
            sb.append(AbstractC0444k.m952p0(str, '.', str));
            sb.append("CompanionObject");
            hashMap3.put(sb.toString(), str.concat(".Companion"));
        }
        for (Map.Entry entry : f16437b.entrySet()) {
            Class cls = (Class) entry.getKey();
            int intValue = ((Number) entry.getValue()).intValue();
            hashMap3.put(cls.getName(), "kotlin.Function" + intValue);
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(AbstractC1817y.m3082N(hashMap3.size()));
        for (Map.Entry entry2 : hashMap3.entrySet()) {
            Object key = entry2.getKey();
            String str2 = (String) entry2.getValue();
            AbstractC3367j.m5097b(str2);
            linkedHashMap.put(key, AbstractC0444k.m952p0(str2, '.', str2));
        }
        f16438c = linkedHashMap;
    }

    public C3362e(Class cls) {
        this.f16439a = cls;
    }

    @Override // p158u5.InterfaceC3361d
    /* renamed from: a */
    public final Class mo5092a() {
        return this.f16439a;
    }

    /* renamed from: b */
    public final String m5093b() {
        String str;
        Class cls = this.f16439a;
        String str2 = null;
        if (cls.isAnonymousClass()) {
            return null;
        }
        if (cls.isLocalClass()) {
            String simpleName = cls.getSimpleName();
            Method enclosingMethod = cls.getEnclosingMethod();
            if (enclosingMethod != null) {
                return AbstractC0444k.m951o0(simpleName, enclosingMethod.getName() + '$', simpleName);
            }
            Constructor<?> enclosingConstructor = cls.getEnclosingConstructor();
            if (enclosingConstructor != null) {
                return AbstractC0444k.m951o0(simpleName, enclosingConstructor.getName() + '$', simpleName);
            }
            return AbstractC0444k.m950n0(simpleName, '$', simpleName);
        }
        boolean isArray = cls.isArray();
        LinkedHashMap linkedHashMap = f16438c;
        if (isArray) {
            Class<?> componentType = cls.getComponentType();
            if (componentType.isPrimitive() && (str = (String) linkedHashMap.get(componentType.getName())) != null) {
                str2 = str.concat("Array");
            }
            if (str2 == null) {
                return "Array";
            }
            return str2;
        }
        String str3 = (String) linkedHashMap.get(cls.getName());
        if (str3 == null) {
            return cls.getSimpleName();
        }
        return str3;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof C3362e) && AbstractC2067b.m3291p(this).equals(AbstractC2067b.m3291p((InterfaceC0111b) obj))) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return AbstractC2067b.m3291p(this).hashCode();
    }

    public final String toString() {
        return this.f16439a + " (Kotlin reflection is not available)";
    }
}
