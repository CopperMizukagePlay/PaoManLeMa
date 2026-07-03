package p135r5;

import java.io.File;
import p158u5.AbstractC3367j;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: r5.f */
/* loaded from: classes.dex */
public final class C3059f extends AbstractC3056c {

    /* renamed from: b */
    public boolean f15650b;

    /* renamed from: c */
    public File[] f15651c;

    /* renamed from: d */
    public int f15652d;

    @Override // p135r5.AbstractC3061h
    /* renamed from: a */
    public final File mo4733a() {
        boolean z7 = this.f15650b;
        File file = this.f15655a;
        if (!z7) {
            this.f15650b = true;
            return file;
        }
        File[] fileArr = this.f15651c;
        if (fileArr != null && this.f15652d >= fileArr.length) {
            return null;
        }
        if (fileArr == null) {
            File[] listFiles = file.listFiles();
            this.f15651c = listFiles;
            if (listFiles == null || listFiles.length == 0) {
                return null;
            }
        }
        File[] fileArr2 = this.f15651c;
        AbstractC3367j.m5097b(fileArr2);
        int i7 = this.f15652d;
        this.f15652d = i7 + 1;
        return fileArr2[i7];
    }
}
