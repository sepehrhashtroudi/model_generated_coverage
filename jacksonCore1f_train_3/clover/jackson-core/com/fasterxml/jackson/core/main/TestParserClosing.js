var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":99,"id":14958,"methods":[{"el":34,"sc":1,"sl":24},{"el":46,"sc":1,"sl":37}],"name":"TestParserClosing","sl":15},{"el":80,"id":14977,"methods":[{"el":71,"sc":9,"sl":69},{"el":77,"sc":9,"sl":73},{"el":79,"sc":9,"sl":79}],"name":"TestParserClosing.MyReader","sl":65},{"el":97,"id":14984,"methods":[{"el":88,"sc":9,"sl":86},{"el":94,"sc":9,"sl":90},{"el":96,"sc":9,"sl":96}],"name":"TestParserClosing.MyStream","sl":82}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_123":{"methods":[{"sl":24}],"name":"testReleaseContentBytes48","pass":true,"statements":[{"sl":25},{"sl":26},{"sl":27},{"sl":28},{"sl":29},{"sl":30},{"sl":31},{"sl":32},{"sl":33}]},"test_93":{"methods":[{"sl":37}],"name":"testReleaseContentChars112","pass":true,"statements":[{"sl":38},{"sl":39},{"sl":40},{"sl":41},{"sl":42},{"sl":43},{"sl":44},{"sl":45}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [123], [123], [123], [123], [123], [123], [123], [123], [123], [123], [], [], [], [93], [93], [93], [93], [93], [93], [93], [93], [93], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], []]
