package p039e5;

import p105n5.C2719b;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: e5.em */
/* loaded from: classes.dex */
public final class EnumC0844em {

    /* renamed from: f */
    public static final EnumC0844em f3777f;

    /* renamed from: g */
    public static final EnumC0844em f3778g;

    /* renamed from: h */
    public static final /* synthetic */ EnumC0844em[] f3779h;

    /* renamed from: i */
    public static final /* synthetic */ C2719b f3780i;

    /* renamed from: e */
    public final String f3781e;

    static {
        EnumC0844em enumC0844em = new EnumC0844em(0, "Last50", "50");
        EnumC0844em enumC0844em2 = new EnumC0844em(1, "Last100", "100");
        f3777f = enumC0844em2;
        EnumC0844em enumC0844em3 = new EnumC0844em(2, "All", "全部");
        EnumC0844em enumC0844em4 = new EnumC0844em(3, "Custom", "自定义");
        f3778g = enumC0844em4;
        EnumC0844em[] enumC0844emArr = {enumC0844em, enumC0844em2, enumC0844em3, enumC0844em4};
        f3779h = enumC0844emArr;
        f3780i = new C2719b(enumC0844emArr);
    }

    public EnumC0844em(int i7, String str, String str2) {
        this.f3781e = str2;
    }

    public static EnumC0844em valueOf(String str) {
        return (EnumC0844em) Enum.valueOf(EnumC0844em.class, str);
    }

    public static EnumC0844em[] values() {
        return (EnumC0844em[]) f3779h.clone();
    }
}
