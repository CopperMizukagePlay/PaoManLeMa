package p039e5;

import java.util.LinkedHashMap;
import p073j2.AbstractC2168e;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: e5.ps */
/* loaded from: classes.dex */
public final class C1193ps {

    /* renamed from: a */
    public final C1131ns f6954a;

    /* renamed from: b */
    public final LinkedHashMap f6955b = new LinkedHashMap();

    public C1193ps(C1131ns c1131ns) {
        this.f6954a = c1131ns;
    }

    /* renamed from: a */
    public final EnumC0876fm m2084a(String str, EnumC0876fm enumC0876fm) {
        int i7 = 0;
        LinkedHashMap linkedHashMap = this.f6955b;
        EnumC0876fm enumC0876fm2 = EnumC0876fm.f4041e;
        if (enumC0876fm == enumC0876fm2) {
            linkedHashMap.put(str, 0);
            return enumC0876fm2;
        }
        Integer num = (Integer) linkedHashMap.get(str);
        if (num != null) {
            i7 = num.intValue();
        }
        int i8 = i7 + 1;
        linkedHashMap.put(str, Integer.valueOf(i8));
        if (i8 >= AbstractC2168e.m3530q(this.f6954a.f6403e, 1, 20)) {
            return enumC0876fm;
        }
        return enumC0876fm2;
    }
}
