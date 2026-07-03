package p037e3;

import android.net.Uri;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: e3.f */
/* loaded from: classes.dex */
public final class C0692f {

    /* renamed from: a */
    public final Uri f2246a;

    /* renamed from: b */
    public final int f2247b;

    /* renamed from: c */
    public final int f2248c;

    /* renamed from: d */
    public final boolean f2249d;

    /* renamed from: e */
    public final String f2250e;

    /* renamed from: f */
    public final int f2251f;

    public C0692f(Uri uri, int i7, int i8, boolean z7, String str, int i9) {
        uri.getClass();
        this.f2246a = uri;
        this.f2247b = i7;
        this.f2248c = i8;
        this.f2249d = z7;
        this.f2250e = str;
        this.f2251f = i9;
    }

    public C0692f(String str, String str2) {
        this.f2246a = new Uri.Builder().scheme("systemfont").authority(str).build();
        this.f2247b = 0;
        this.f2248c = 400;
        this.f2249d = false;
        this.f2250e = str2;
        this.f2251f = 0;
    }
}
