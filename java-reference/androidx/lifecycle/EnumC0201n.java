package androidx.lifecycle;

import p105n5.C2719b;
import p105n5.InterfaceC2718a;
import p144t.AbstractC3122c;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: androidx.lifecycle.n */
/* loaded from: classes.dex */
public final class EnumC0201n {
    private static final /* synthetic */ InterfaceC2718a $ENTRIES;
    private static final /* synthetic */ EnumC0201n[] $VALUES;
    public static final C0197l Companion;
    public static final EnumC0201n ON_ANY;
    public static final EnumC0201n ON_CREATE;
    public static final EnumC0201n ON_DESTROY;
    public static final EnumC0201n ON_PAUSE;
    public static final EnumC0201n ON_RESUME;
    public static final EnumC0201n ON_START;
    public static final EnumC0201n ON_STOP;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, androidx.lifecycle.n] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, androidx.lifecycle.l] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, androidx.lifecycle.n] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, androidx.lifecycle.n] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Enum, androidx.lifecycle.n] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Enum, androidx.lifecycle.n] */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Enum, androidx.lifecycle.n] */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.lang.Enum, androidx.lifecycle.n] */
    static {
        ?? r02 = new Enum("ON_CREATE", 0);
        ON_CREATE = r02;
        ?? r12 = new Enum("ON_START", 1);
        ON_START = r12;
        ?? r22 = new Enum("ON_RESUME", 2);
        ON_RESUME = r22;
        ?? r32 = new Enum("ON_PAUSE", 3);
        ON_PAUSE = r32;
        ?? r42 = new Enum("ON_STOP", 4);
        ON_STOP = r42;
        ?? r52 = new Enum("ON_DESTROY", 5);
        ON_DESTROY = r52;
        ?? r62 = new Enum("ON_ANY", 6);
        ON_ANY = r62;
        EnumC0201n[] enumC0201nArr = {r02, r12, r22, r32, r42, r52, r62};
        $VALUES = enumC0201nArr;
        $ENTRIES = new C2719b(enumC0201nArr);
        Companion = new Object();
    }

    public static EnumC0201n valueOf(String str) {
        return (EnumC0201n) Enum.valueOf(EnumC0201n.class, str);
    }

    public static EnumC0201n[] values() {
        return (EnumC0201n[]) $VALUES.clone();
    }

    /* renamed from: a */
    public final EnumC0203o m463a() {
        switch (AbstractC0199m.f856a[ordinal()]) {
            case 1:
            case 2:
                return EnumC0203o.f865g;
            case 3:
            case 4:
                return EnumC0203o.f866h;
            case AbstractC3122c.f15761f /* 5 */:
                return EnumC0203o.f867i;
            case AbstractC3122c.f15759d /* 6 */:
                return EnumC0203o.f863e;
            case 7:
                throw new IllegalArgumentException(this + " has no target state");
            default:
                throw new RuntimeException();
        }
    }
}
